/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.dongiao;

import comon.constant.PaginationConstant;
import comon.utilities.HibernateUtil;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import model.dongiao.DonGiao;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ADMIN KH
 */
public class DonGiaoRepository {
      public List<DonGiao> findAll(int position) {
        List<DonGiao> listModel;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM DonGiao x";
            TypedQuery<DonGiao> query = session.createQuery(hql, DonGiao.class);
            query.setFirstResult(position);
            query.setMaxResults(PaginationConstant.DEFAULT_SIZE);
            listModel = query.getResultList();
        }
        return listModel;
    }

    public List<DonGiao> findAll() {
        List<DonGiao> listModel;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM DonGiao x";
            TypedQuery<DonGiao> query = session.createQuery(hql, DonGiao.class);
            listModel = query.getResultList();
        }
        return listModel;
    }

    public DonGiao findById(String id) {
        DonGiao model;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM DonGiao x WHERE x.id = :id";
            TypedQuery<DonGiao> query = session.createQuery(hql, DonGiao.class);
            query.setParameter("id", id);
            model = query.getSingleResult();
        }
        return model;
    }

    public DonGiao findByMa(String ma) {
       DonGiao model = null;
        List<DonGiao> listModel;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM DonGiao x WHERE x.ma = :ma";
            TypedQuery<DonGiao> query = session.createQuery(hql, DonGiao.class);
            query.setParameter("ma", ma);
            listModel = query.getResultList();
        }
        if (!listModel.isEmpty()) {
            model = listModel.get(0);
        }
        return model;
    }

    public DonGiao save(DonGiao model) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.saveOrUpdate(model);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                model = null;
            }
        } finally {
            return model;
        }
    }

    public boolean delete(String id) {
        int result = 0;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                String hql = "DELETE ChatLieu x WHERE x.id = :id";
                Query query = session.createQuery(hql);
                query.setParameter("id", id);
                result = query.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result > 0;
    }

    public long totalCount() {
        long total = 0;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String statement = "SELECT COUNT(x.id) FROM ChatLieu x";
            TypedQuery<Long> query = session.createQuery(statement, Long.class);
            total = query.getSingleResult();
        }
        return total;
    }
}


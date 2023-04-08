/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.hoadon;

import comon.constant.PaginationConstant;
import comon.utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.TypedQuery;
import model.hoadon.HoaDon;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author ADMIN KH
 */
public class HoaDonRepository {

    public List<HoaDon> findAll(int position) {
        List<HoaDon> listModel;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM HoaDon x";
            TypedQuery<HoaDon> query = session.createQuery(hql, HoaDon.class);
            query.setFirstResult(position);
            query.setMaxResults(PaginationConstant.DEFAULT_SIZE);
            listModel = query.getResultList();
        }
        return listModel;
    }

    public List<HoaDon> findAll() {
        List<HoaDon> listModel;
        try ( Session s = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM HoaDon x";
            TypedQuery<HoaDon> query = s.createQuery(hql, HoaDon.class);
            listModel = query.getResultList();
        }
        return listModel;
    }

    public HoaDon findById(String id) {
        HoaDon model;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM HoaDon x WHERE x.id =:id";
            TypedQuery<HoaDon> query = session.createQuery(hql, HoaDon.class);
            query.setParameter("id", id);
            model = query.getSingleResult();

        }
        return model;
    }

    public HoaDon save(HoaDon model) {
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
                String hql = "DELETE HoaDon x WHERE x.id = :id";
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
            String statement = "SELECT COUNT(x.id) FROM HoaDon x";
            TypedQuery<Long> query = session.createQuery(statement, Long.class);
            total = query.getSingleResult();

        }
        return total;
    }
}

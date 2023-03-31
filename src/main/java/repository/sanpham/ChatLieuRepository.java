/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.sanpham;


import comon.constant.PaginationConstant;
import comon.utilities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import model.sanpham.ChatLieu;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenth28
 */
public class ChatLieuRepository {

    public List<ChatLieu> findAll(int position) {
        List<ChatLieu> listModel;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM ChatLieu x";
            TypedQuery<ChatLieu> query = session.createQuery(hql, ChatLieu.class);
            query.setFirstResult(position);
            query.setMaxResults(PaginationConstant.DEFAULT_SIZE);
            listModel = query.getResultList();
        }
        return listModel;
    }

    public List<ChatLieu> findAll() {
        List<ChatLieu> listModel;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM ChatLieu x";
            TypedQuery<ChatLieu> query = session.createQuery(hql, ChatLieu.class);
            listModel = query.getResultList();
        }
        return listModel;
    }

    public ChatLieu findById(String id) {
        ChatLieu model;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM ChatLieu x WHERE x.id = :id";
            TypedQuery<ChatLieu> query = session.createQuery(hql, ChatLieu.class);
            query.setParameter("id", id);
            model = query.getSingleResult();
        }
        return model;
    }

    public ChatLieu findByMa(String ma) {
        ChatLieu model = null;
        List<ChatLieu> listModel;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT x FROM ChatLieu x WHERE x.ma = :ma";
            TypedQuery<ChatLieu> query = session.createQuery(hql, ChatLieu.class);
            query.setParameter("ma", ma);
            listModel = query.getResultList();
        }
        if (!listModel.isEmpty()) {
            model = listModel.get(0);
        }
        return model;
    }

    public ChatLieu save(ChatLieu model) {
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

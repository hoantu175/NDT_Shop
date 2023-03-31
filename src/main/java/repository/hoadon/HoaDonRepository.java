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
    private final SessionFactory factory;

    public HoaDonRepository() {
        this.factory = HibernateUtil.getSessionFactory();
    }
    public List<HoaDon> getAll(int currentPage) {
        String hql = "FROM HoaDon";
        List<HoaDon> listHoaDon = new ArrayList<>();
        try ( Session s = factory.openSession()) {
            Query<HoaDon> query = s.createQuery(hql, HoaDon.class);
            query.setFirstResult((currentPage - 1) * PaginationConstant.DEFAULT_SIZE);
            query.setMaxResults(PaginationConstant.DEFAULT_SIZE);
            listHoaDon = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    public boolean saveOrUpdate(HoaDon x) {
        Transaction tx = null;
        try ( Session s = factory.openSession()) {
            tx = s.beginTransaction();
            s.saveOrUpdate(x);
            tx.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        }
        return false;
    }

    public boolean delete(String id) {
        int check;
        String hql = "DELETE FROM HoaDon WHERE id = :id";
        Transaction tx = null;
        try ( Session s = factory.openSession()) {
            tx = s.beginTransaction();
            Query q = s.createQuery(hql);
            q.setParameter("id", id);
            check = q.executeUpdate();
            tx.commit();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        }
        return false;
    }

    public Optional<HoaDon> finByID(String id) {
        String hql = "FROM HoaDon  WHERE id = :id";
        List<HoaDon> list = new ArrayList<>();
        HoaDon x = null;
        try ( Session s = factory.openSession()) {
            Query<HoaDon> q = s.createQuery(hql, HoaDon.class);
            q.setParameter("id", id);
            list = q.getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        if (!list.isEmpty()) {
            x = list.get(0);
        }
        return Optional.ofNullable(x);
    }

    public long count() {
        long count = 0;
        String hql = "SELECT COUNT(id)FROM HoaDon";
        try ( Session s = factory.openSession()) {
            Query q = s.createQuery(hql);
            count = (long) q.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return count;
    }
}

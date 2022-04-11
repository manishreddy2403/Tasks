package com.service;


import com.model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("database")
public class TeamServiceImp implements TeamService{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Team> getTeam(){
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        List<Team> teamList=session.createQuery("from Team ", Team.class).list();
        transaction.commit();
        session.close();
        return teamList;
    }

    @Override
    public Team getTeamById(int teamId) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Team team=session.get(Team.class,teamId);
        transaction.commit();
        session.close();

        return team;
    }

    @Override
    public Team createTeam(Team team)  {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(team);
        transaction.commit();
        session.close();
        return team;
    }



    @Override
    public Team deleteTeam(Team team) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(team);
        transaction.commit();
        session.close();
        return team;
    }

    @Override
    public Team updateTeam(Team team) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(team);
        transaction.commit();
        session.close();
        return team;
    }
}

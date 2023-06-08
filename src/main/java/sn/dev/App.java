package sn.dev;

import sn.dev.config.HibernateUtil;
import sn.dev.dao.ClasseImpl;
import sn.dev.dao.IClasse;
import sn.dev.entities.Classe;

public class App {
    public static void main(String[] args) {
        IClasse classeDao = new ClasseImpl();
        //Creation d'une classe
        /*Classe classe = new Classe();
        classe.setLibelle("L3IAGE");
        int ok = classeDao.create(classe);
        if(ok == 1)
            System.out.println("OK");
        else
            System.out.println("KO");*/
        //Liste
        /*classeDao.getAll().forEach(
                cl -> {
                    System.out.println("ID : "+ cl.getId());
                    System.out.println("NOM : "+ cl.getLibelle());
                    System.out.println("EFFECTIF : "+ cl.getEffectif());
                }
        );*/
        //Selection et modification

        //Suppression
        /*int ok = classeDao.delete(2);
        if(ok == 1)
            System.out.println("OK");
        else
            System.out.println("KO");*/
    }
}

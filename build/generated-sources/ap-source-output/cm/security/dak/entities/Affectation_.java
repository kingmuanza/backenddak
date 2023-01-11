package cm.security.dak.entities;

import cm.security.dak.entities.Poste;
import cm.security.dak.entities.Vigile;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-25T14:51:22")
@StaticMetamodel(Affectation.class)
public class Affectation_ { 

    public static volatile SingularAttribute<Affectation, String> horaire;
    public static volatile SingularAttribute<Affectation, Vigile> remplacant;
    public static volatile SingularAttribute<Affectation, String> jourRepos;
    public static volatile SingularAttribute<Affectation, Integer> idaffectation;
    public static volatile SingularAttribute<Affectation, Vigile> idvigile;
    public static volatile SingularAttribute<Affectation, Date> dateAffectation;
    public static volatile SingularAttribute<Affectation, String> jourPl;
    public static volatile SingularAttribute<Affectation, String> qualite;
    public static volatile SingularAttribute<Affectation, Poste> idposte;
    public static volatile SingularAttribute<Affectation, Vigile> placement;
    public static volatile SingularAttribute<Affectation, String> type;
    public static volatile SingularAttribute<Affectation, Date> arret;

}
package cm.security.dak.entities;

import cm.security.dak.entities.Vigile;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-25T14:51:22")
@StaticMetamodel(Ville.class)
public class Ville_ { 

    public static volatile SingularAttribute<Ville, String> code;
    public static volatile SingularAttribute<Ville, Integer> idville;
    public static volatile CollectionAttribute<Ville, Vigile> vigileCollection;
    public static volatile SingularAttribute<Ville, String> libelle;

}
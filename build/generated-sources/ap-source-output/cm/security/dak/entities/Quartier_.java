package cm.security.dak.entities;

import cm.security.dak.entities.Poste;
import cm.security.dak.entities.Vigile;
import cm.security.dak.entities.Zone;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-25T14:51:22")
@StaticMetamodel(Quartier.class)
public class Quartier_ { 

    public static volatile SingularAttribute<Quartier, Zone> idzone;
    public static volatile SingularAttribute<Quartier, String> code;
    public static volatile CollectionAttribute<Quartier, Vigile> vigileCollection;
    public static volatile CollectionAttribute<Quartier, Poste> posteCollection;
    public static volatile SingularAttribute<Quartier, Integer> idquartier;
    public static volatile SingularAttribute<Quartier, String> nom;

}
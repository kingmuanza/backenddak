package cm.security.dak.entities;

import cm.security.dak.entities.Poste;
import cm.security.dak.entities.Quartier;
import cm.security.dak.entities.SuiviPoste;
import cm.security.dak.entities.Vigile;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-25T14:51:22")
@StaticMetamodel(Zone.class)
public class Zone_ { 

    public static volatile SingularAttribute<Zone, Integer> idzone;
    public static volatile SingularAttribute<Zone, String> horaire;
    public static volatile CollectionAttribute<Zone, Quartier> quartierCollection;
    public static volatile SingularAttribute<Zone, String> code;
    public static volatile CollectionAttribute<Zone, Vigile> vigileCollection;
    public static volatile CollectionAttribute<Zone, Poste> posteCollection;
    public static volatile SingularAttribute<Zone, String> libelle;
    public static volatile CollectionAttribute<Zone, SuiviPoste> suiviPosteCollection;

}
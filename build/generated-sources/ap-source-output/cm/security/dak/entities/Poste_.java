package cm.security.dak.entities;

import cm.security.dak.entities.Affectation;
import cm.security.dak.entities.Quartier;
import cm.security.dak.entities.SuiviPoste;
import cm.security.dak.entities.Zone;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-25T14:51:22")
@StaticMetamodel(Poste.class)
public class Poste_ { 

    public static volatile SingularAttribute<Poste, Boolean> prime;
    public static volatile CollectionAttribute<Poste, Affectation> affectationCollection;
    public static volatile SingularAttribute<Poste, Integer> note;
    public static volatile SingularAttribute<Poste, String> code;
    public static volatile SingularAttribute<Poste, String> contrat;
    public static volatile SingularAttribute<Poste, Integer> zoneJour;
    public static volatile SingularAttribute<Poste, String> libelle;
    public static volatile SingularAttribute<Poste, Double> latitude;
    public static volatile SingularAttribute<Poste, Date> debutContrat;
    public static volatile CollectionAttribute<Poste, SuiviPoste> suiviPosteCollection;
    public static volatile SingularAttribute<Poste, Quartier> idquartier;
    public static volatile SingularAttribute<Poste, Integer> nombreVigileNuit;
    public static volatile SingularAttribute<Poste, Date> finContrat;
    public static volatile SingularAttribute<Poste, Integer> nombreESC;
    public static volatile SingularAttribute<Poste, Integer> nombreMC;
    public static volatile SingularAttribute<Poste, String> abrege;
    public static volatile SingularAttribute<Poste, Integer> zoneNuit;
    public static volatile SingularAttribute<Poste, Zone> zone;
    public static volatile SingularAttribute<Poste, Integer> nombreRadio;
    public static volatile SingularAttribute<Poste, String> contact;
    public static volatile SingularAttribute<Poste, Integer> nombreVigileJour;
    public static volatile SingularAttribute<Poste, String> tel;
    public static volatile SingularAttribute<Poste, Integer> idposte;
    public static volatile SingularAttribute<Poste, Double> longitude;

}
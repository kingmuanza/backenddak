package cm.security.dak.entities;

import cm.security.dak.entities.Poste;
import cm.security.dak.entities.Vigile;
import cm.security.dak.entities.Zone;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-25T14:51:22")
@StaticMetamodel(SuiviPoste.class)
public class SuiviPoste_ { 

    public static volatile SingularAttribute<SuiviPoste, String> horaire;
    public static volatile SingularAttribute<SuiviPoste, String> nombreAbsence;
    public static volatile SingularAttribute<SuiviPoste, String> montantSanction;
    public static volatile SingularAttribute<SuiviPoste, String> numero;
    public static volatile SingularAttribute<SuiviPoste, Date> dateSuivi;
    public static volatile SingularAttribute<SuiviPoste, Zone> zone;
    public static volatile SingularAttribute<SuiviPoste, String> motifSanction;
    public static volatile SingularAttribute<SuiviPoste, Vigile> idvigile;
    public static volatile SingularAttribute<SuiviPoste, Poste> poste;
    public static volatile SingularAttribute<SuiviPoste, Integer> idsuiviPoste;
    public static volatile SingularAttribute<SuiviPoste, String> pl;
    public static volatile SingularAttribute<SuiviPoste, String> nombreSanction;
    public static volatile SingularAttribute<SuiviPoste, String> commentaire;
    public static volatile SingularAttribute<SuiviPoste, String> statut;
    public static volatile SingularAttribute<SuiviPoste, String> motifAbsence;

}
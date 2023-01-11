/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Muanza Kangudie
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(cm.security.dak.entities.service.AffectationFacadeREST.class);
        resources.add(cm.security.dak.entities.service.ContratFacadeREST.class);
        resources.add(cm.security.dak.entities.service.ContratSiteFacadeREST.class);
        resources.add(cm.security.dak.entities.service.ContratSiteVigileFacadeREST.class);
        resources.add(cm.security.dak.entities.service.EquipementFacadeREST.class);
        resources.add(cm.security.dak.entities.service.EquipementVigileFacadeREST.class);
        resources.add(cm.security.dak.entities.service.FactureFacadeREST.class);
        resources.add(cm.security.dak.entities.service.FactureLigneFacadeREST.class);
        resources.add(cm.security.dak.entities.service.MotifFacadeREST.class);
        resources.add(cm.security.dak.entities.service.NationaliteFacadeREST.class);
        resources.add(cm.security.dak.entities.service.PermissionFacadeREST.class);
        resources.add(cm.security.dak.entities.service.PosteEquipementFacadeREST.class);
        resources.add(cm.security.dak.entities.service.PosteFacadeREST.class);
        resources.add(cm.security.dak.entities.service.PosteVigileFacadeREST.class);
        resources.add(cm.security.dak.entities.service.PrestationFacadeREST.class);
        resources.add(cm.security.dak.entities.service.QuartierFacadeREST.class);
        resources.add(cm.security.dak.entities.service.StatutFacadeREST.class);
        resources.add(cm.security.dak.entities.service.SuiviPosteFacadeREST.class);
        resources.add(cm.security.dak.entities.service.SwitchFacadeREST.class);
        resources.add(cm.security.dak.entities.service.VigileCongeFacadeREST.class);
        resources.add(cm.security.dak.entities.service.VigileFacadeREST.class);
        resources.add(cm.security.dak.entities.service.VilleFacadeREST.class);
        resources.add(cm.security.dak.entities.service.ZoneFacadeREST.class);
        resources.add(cm.security.dak.filters.CORSFilter.class);
        resources.add(cm.security.dak.filters.CORSFilterRequest.class);
    }
    
}

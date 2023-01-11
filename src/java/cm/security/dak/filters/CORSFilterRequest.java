/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.security.dak.filters;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Provider
public class CORSFilterRequest implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext cres) throws IOException {
        
        System.out.println("Je suis passé dans le filter de request");

        
        MediaType type = cres.getMediaType();
        System.out.println("type");

        if (type != null) {
            System.out.println(type);
            String contentType = type.toString();
            if (!contentType.contains("charset")) {
                contentType = contentType + ";charset=utf-8";
                System.out.println("contentType");
                System.out.println(contentType);
                cres.getHeaders().putSingle("Content-Type", contentType);
            }
        } else {

            System.out.println("il ny a aucun type");
            cres.getHeaders().putSingle("Content-Type", "application/json;charset=utf-8");
        }
    }
    
}

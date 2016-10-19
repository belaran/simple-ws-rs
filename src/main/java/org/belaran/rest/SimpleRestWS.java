/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.belaran.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class SimpleRestWS {

    @GET
    @Path("/test")
	@Produces("text/plain")
    // curl http://127.0.0.1:8080/SimpleWebServiceReST/rest/test
    public Response test() {
    	return  Response.ok("hello\n").build();
    }

    @PUT
    @Path("/xml")
    @Consumes("text/plain")
	@Produces("text/plain")
    //curl -X PUT http://127.0.0.1:8080/SimpleWebServiceReST/rest/xml -d 'hello' -H "Content-Type: text/plain
    public Response push(String pojo) {
        System.out.println("push:");
        System.out.println(pojo);
        return Response.ok(pojo).build();
    }

}

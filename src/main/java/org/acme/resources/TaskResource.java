

package org.acme.resources;

import org.acme.entity.Task;
import org.acme.services.TaskService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/tasks")
public class TaskResource {

    @Inject
    TaskService taskService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Task> get() {
        return taskService.listar();
    }
}
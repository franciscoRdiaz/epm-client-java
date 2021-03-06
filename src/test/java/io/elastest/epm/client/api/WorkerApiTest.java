/*
 * EPM REST API
 * REST API description of the ElasTest Platform Manager Module.
 *
 * OpenAPI spec version: 0.1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.elastest.epm.client.api;

import io.elastest.epm.client.ApiException;
import io.elastest.epm.client.model.Worker;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkerApi
 */
@Ignore
public class WorkerApiTest {

    private final WorkerApi api = new WorkerApi();

    
    /**
     * Deletes a Resource Group.
     *
     * Deletes the Worker that matches with a given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorkerTest() throws ApiException {
        String id = null;
        String response = api.deleteWorker(id);

        // TODO: test validations
    }
    
    /**
     * Returns all registered workers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllWorkersTest() throws ApiException {
        List<Worker> response = api.getAllWorkers();
        System.out.print(response);

        // TODO: test validations
    }
    
    /**
     * Sets up the specified worker to install the specified type of adapter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void installAdapterTest() throws ApiException {
        String id = null;
        String type = null;
        String response = api.installAdapter("c3b14774-5376-4d70-9c2f-3e94ac78e13d", "docker");

        // TODO: test validations
    }
    
    /**
     * Registers the worker and saves the information.
     *
     * This registers a worker with the information provided.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerWorkerTest() throws ApiException {
        Worker body = null;
        Worker response = api.registerWorker(body);
        // TODO: test validations
    }
    
}

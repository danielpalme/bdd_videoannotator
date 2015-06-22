
package com.github.shell88.bddvideoannotator.stubjava;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AnnotationService", targetNamespace = "http://service.bddvideoannotator.shell88.github.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnnotationService {


    /**
     * 
     */
    @WebMethod
    @Action(input = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/stopScenarioRequest", output = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/stopScenarioResponse")
    public void stopScenario();

    /**
     * 
     * @param datatable
     * @param steptext
     */
    @WebMethod
    @Action(input = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/addStepToBufferRequest", output = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/addStepToBufferResponse")
    public void addStepToBuffer(
        @WebParam(name = "steptext", partName = "steptext")
        String steptext,
        @WebParam(name = "datatable", partName = "datatable")
        StringArrayArray datatable);

    /**
     * 
     * @param scenarioName
     */
    @WebMethod
    @Action(input = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/startScenarioRequest", output = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/startScenarioResponse")
    public void startScenario(
        @WebParam(name = "scenarioName", partName = "scenarioName")
        String scenarioName);

    /**
     * 
     * @param path
     */
    @WebMethod
    @Action(input = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/changeOutputDirectoryRequest", output = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/changeOutputDirectoryResponse")
    public void changeOutputDirectory(
        @WebParam(name = "path", partName = "path")
        String path);

    /**
     * 
     * @param result
     */
    @WebMethod
    @Action(input = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/addResultToBufferStepRequest", output = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/addResultToBufferStepResponse")
    public void addResultToBufferStep(
        @WebParam(name = "result", partName = "result")
        StepResult result);

    /**
     * 
     * @param result
     * @param datatable
     * @param steptext
     */
    @WebMethod
    @Action(input = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/addStepWithResultRequest", output = "http://service.bddvideoannotator.shell88.github.com/AnnotationService/addStepWithResultResponse")
    public void addStepWithResult(
        @WebParam(name = "steptext", partName = "steptext")
        String steptext,
        @WebParam(name = "datatable", partName = "datatable")
        StringArrayArray datatable,
        @WebParam(name = "result", partName = "result")
        StepResult result);

}
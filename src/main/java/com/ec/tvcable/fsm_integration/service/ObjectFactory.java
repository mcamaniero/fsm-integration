
package com.ec.tvcable.fsm_integration.service;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ec.tvcable.fsm_integration.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateWorkOrderQueryAdditionalRequirements_QNAME = new QName("", "additionalRequirements");
    private final static QName _CreateWorkOrderQueryWorkOrderId_QNAME = new QName("", "workOrderId");
    private final static QName _CreateWorkOrderQueryInventory_QNAME = new QName("", "inventory");
    private final static QName _CreateWorkOrderQueryCustomer_QNAME = new QName("", "customer");
    private final static QName _FetchAvailableAppointmentSlotsResponse_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "fetchAvailableAppointmentSlotsResponse");
    private final static QName _CreateWorkOrder_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "createWorkOrder");
    private final static QName _RescheduleTask_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "rescheduleTask");
    private final static QName _CreateWorkOrderResponse_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "createWorkOrderResponse");
    private final static QName _ModifyWorkOrder_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "modifyWorkOrder");
    private final static QName _RescheduleTaskResponse_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "rescheduleTaskResponse");
    private final static QName _CancelWorkOrder_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "cancelWorkOrder");
    private final static QName _ApplicationException_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "ApplicationException");
    private final static QName _FetchAvailableAppointmentSlots_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "fetchAvailableAppointmentSlots");
    private final static QName _CreateTask_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "createTask");
    private final static QName _CancelTaskResponse_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "cancelTaskResponse");
    private final static QName _CloseWorkOrderResponse_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "closeWorkOrderResponse");
    private final static QName _FetchWorkOrderResponse_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "fetchWorkOrderResponse");
    private final static QName _FetchWorkOrder_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "fetchWorkOrder");
    private final static QName _CancelWorkOrderResponse_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "cancelWorkOrderResponse");
    private final static QName _CancelTask_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "cancelTask");
    private final static QName _CloseWorkOrder_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "closeWorkOrder");
    private final static QName _ModifyWorkOrderResponse_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "modifyWorkOrderResponse");
    private final static QName _CreateTaskResponse_QNAME = new QName("http://soap.integration.fsm.comarch.com/", "createTaskResponse");
    private final static QName _AdministrationUnitId_QNAME = new QName("", "id");
    private final static QName _AdministrationUnitAdministrationUnit_QNAME = new QName("", "administrationUnit");
    private final static QName _CustomerBusinessName_QNAME = new QName("", "businessName");
    private final static QName _CustomerLastName_QNAME = new QName("", "lastName");
    private final static QName _CustomerLocation_QNAME = new QName("", "location");
    private final static QName _CustomerEmail_QNAME = new QName("", "email");
    private final static QName _CustomerPhoneNumber2_QNAME = new QName("", "phoneNumber2");
    private final static QName _CustomerPhoneNumber1_QNAME = new QName("", "phoneNumber1");
    private final static QName _CustomerFirstName_QNAME = new QName("", "firstName");
    private final static QName _CustomerContacts_QNAME = new QName("", "contacts");
    private final static QName _CustomerPhoneNumber3_QNAME = new QName("", "phoneNumber3");
    private final static QName _LocationBuildingNo_QNAME = new QName("", "buildingNo");
    private final static QName _LocationStreetId_QNAME = new QName("", "streetId");
    private final static QName _LocationCityId_QNAME = new QName("", "cityId");
    private final static QName _LocationDescription_QNAME = new QName("", "description");
    private final static QName _LocationLongitude_QNAME = new QName("", "longitude");
    private final static QName _LocationStreetName_QNAME = new QName("", "streetName");
    private final static QName _LocationLatitude_QNAME = new QName("", "latitude");
    private final static QName _LocationFlatNo_QNAME = new QName("", "flatNo");
    private final static QName _LocationCityAdministrationUnit_QNAME = new QName("", "cityAdministrationUnit");
    private final static QName _InventoryServices_QNAME = new QName("", "services");
    private final static QName _InventoryNode_QNAME = new QName("", "node");
    private final static QName _InventoryDevices_QNAME = new QName("", "devices");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ec.tvcable.fsm_integration.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WorkOrderQuery }
     * 
     */
    public WorkOrderQuery createWorkOrderQuery() {
        return new WorkOrderQuery();
    }

    /**
     * Create an instance of {@link AvailableSlots }
     * 
     */
    public AvailableSlots createAvailableSlots() {
        return new AvailableSlots();
    }

    /**
     * Create an instance of {@link WorkOrder }
     * 
     */
    public WorkOrder createWorkOrder() {
        return new WorkOrder();
    }

    /**
     * Create an instance of {@link FetchWorkOrder }
     * 
     */
    public FetchWorkOrder createFetchWorkOrder() {
        return new FetchWorkOrder();
    }

    /**
     * Create an instance of {@link FetchWorkOrderResponse }
     * 
     */
    public FetchWorkOrderResponse createFetchWorkOrderResponse() {
        return new FetchWorkOrderResponse();
    }

    /**
     * Create an instance of {@link CreateTaskResponse }
     * 
     */
    public CreateTaskResponse createCreateTaskResponse() {
        return new CreateTaskResponse();
    }

    /**
     * Create an instance of {@link CancelWorkOrderResponse }
     * 
     */
    public CancelWorkOrderResponse createCancelWorkOrderResponse() {
        return new CancelWorkOrderResponse();
    }

    /**
     * Create an instance of {@link CloseWorkOrder }
     * 
     */
    public CloseWorkOrder createCloseWorkOrder() {
        return new CloseWorkOrder();
    }

    /**
     * Create an instance of {@link ModifyWorkOrderResponse }
     * 
     */
    public ModifyWorkOrderResponse createModifyWorkOrderResponse() {
        return new ModifyWorkOrderResponse();
    }

    /**
     * Create an instance of {@link CancelTask }
     * 
     */
    public CancelTask createCancelTask() {
        return new CancelTask();
    }

    /**
     * Create an instance of {@link ModifyWorkOrder }
     * 
     */
    public ModifyWorkOrder createModifyWorkOrder() {
        return new ModifyWorkOrder();
    }

    /**
     * Create an instance of {@link RescheduleTask }
     * 
     */
    public RescheduleTask createRescheduleTask() {
        return new RescheduleTask();
    }

    /**
     * Create an instance of {@link CreateWorkOrderResponse }
     * 
     */
    public CreateWorkOrderResponse createCreateWorkOrderResponse() {
        return new CreateWorkOrderResponse();
    }

    /**
     * Create an instance of {@link RescheduleTaskResponse }
     * 
     */
    public RescheduleTaskResponse createRescheduleTaskResponse() {
        return new RescheduleTaskResponse();
    }

    /**
     * Create an instance of {@link FetchAvailableAppointmentSlotsResponse }
     * 
     */
    public FetchAvailableAppointmentSlotsResponse createFetchAvailableAppointmentSlotsResponse() {
        return new FetchAvailableAppointmentSlotsResponse();
    }

    /**
     * Create an instance of {@link CreateWorkOrder }
     * 
     */
    public CreateWorkOrder createCreateWorkOrder() {
        return new CreateWorkOrder();
    }

    /**
     * Create an instance of {@link CreateTask }
     * 
     */
    public CreateTask createCreateTask() {
        return new CreateTask();
    }

    /**
     * Create an instance of {@link CloseWorkOrderResponse }
     * 
     */
    public CloseWorkOrderResponse createCloseWorkOrderResponse() {
        return new CloseWorkOrderResponse();
    }

    /**
     * Create an instance of {@link CancelTaskResponse }
     * 
     */
    public CancelTaskResponse createCancelTaskResponse() {
        return new CancelTaskResponse();
    }

    /**
     * Create an instance of {@link CancelWorkOrder }
     * 
     */
    public CancelWorkOrder createCancelWorkOrder() {
        return new CancelWorkOrder();
    }

    /**
     * Create an instance of {@link FetchAvailableAppointmentSlots }
     * 
     */
    public FetchAvailableAppointmentSlots createFetchAvailableAppointmentSlots() {
        return new FetchAvailableAppointmentSlots();
    }

    /**
     * Create an instance of {@link ApplicationException }
     * 
     */
    public ApplicationException createApplicationException() {
        return new ApplicationException();
    }

    /**
     * Create an instance of {@link RescheduleTaskQuery }
     * 
     */
    public RescheduleTaskQuery createRescheduleTaskQuery() {
        return new RescheduleTaskQuery();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link CancelWorkOrderQuery }
     * 
     */
    public CancelWorkOrderQuery createCancelWorkOrderQuery() {
        return new CancelWorkOrderQuery();
    }

    /**
     * Create an instance of {@link AdditionalSkills }
     * 
     */
    public AdditionalSkills createAdditionalSkills() {
        return new AdditionalSkills();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Contacts }
     * 
     */
    public Contacts createContacts() {
        return new Contacts();
    }

    /**
     * Create an instance of {@link TasksList }
     * 
     */
    public TasksList createTasksList() {
        return new TasksList();
    }

    /**
     * Create an instance of {@link Executors }
     * 
     */
    public Executors createExecutors() {
        return new Executors();
    }

    /**
     * Create an instance of {@link AssignedExecutor }
     * 
     */
    public AssignedExecutor createAssignedExecutor() {
        return new AssignedExecutor();
    }

    /**
     * Create an instance of {@link WorkOrderItem }
     * 
     */
    public WorkOrderItem createWorkOrderItem() {
        return new WorkOrderItem();
    }

    /**
     * Create an instance of {@link Services }
     * 
     */
    public Services createServices() {
        return new Services();
    }

    /**
     * Create an instance of {@link AdditionalTaskTypes }
     * 
     */
    public AdditionalTaskTypes createAdditionalTaskTypes() {
        return new AdditionalTaskTypes();
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link CustomerQuery }
     * 
     */
    public CustomerQuery createCustomerQuery() {
        return new CustomerQuery();
    }

    /**
     * Create an instance of {@link Devices }
     * 
     */
    public Devices createDevices() {
        return new Devices();
    }

    /**
     * Create an instance of {@link AvailableSlotsQuery }
     * 
     */
    public AvailableSlotsQuery createAvailableSlotsQuery() {
        return new AvailableSlotsQuery();
    }

    /**
     * Create an instance of {@link AdministrationUnit }
     * 
     */
    public AdministrationUnit createAdministrationUnit() {
        return new AdministrationUnit();
    }

    /**
     * Create an instance of {@link ReturnedAttribute }
     * 
     */
    public ReturnedAttribute createReturnedAttribute() {
        return new ReturnedAttribute();
    }

    /**
     * Create an instance of {@link WorkOrderList }
     * 
     */
    public WorkOrderList createWorkOrderList() {
        return new WorkOrderList();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link CreateWorkOrderQuery }
     * 
     */
    public CreateWorkOrderQuery createCreateWorkOrderQuery() {
        return new CreateWorkOrderQuery();
    }

    /**
     * Create an instance of {@link CancelTaskQuery }
     * 
     */
    public CancelTaskQuery createCancelTaskQuery() {
        return new CancelTaskQuery();
    }

    /**
     * Create an instance of {@link Slot }
     * 
     */
    public Slot createSlot() {
        return new Slot();
    }

    /**
     * Create an instance of {@link CreateTaskQuery }
     * 
     */
    public CreateTaskQuery createCreateTaskQuery() {
        return new CreateTaskQuery();
    }

    /**
     * Create an instance of {@link TimeInterval }
     * 
     */
    public TimeInterval createTimeInterval() {
        return new TimeInterval();
    }

    /**
     * Create an instance of {@link ReturnedAttrValue }
     * 
     */
    public ReturnedAttrValue createReturnedAttrValue() {
        return new ReturnedAttrValue();
    }

    /**
     * Create an instance of {@link ReturnedAttributes }
     * 
     */
    public ReturnedAttributes createReturnedAttributes() {
        return new ReturnedAttributes();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link Executor }
     * 
     */
    public Executor createExecutor() {
        return new Executor();
    }

    /**
     * Create an instance of {@link AdditionalAttribute }
     * 
     */
    public AdditionalAttribute createAdditionalAttribute() {
        return new AdditionalAttribute();
    }

    /**
     * Create an instance of {@link ModifyWorkOrderQuery }
     * 
     */
    public ModifyWorkOrderQuery createModifyWorkOrderQuery() {
        return new ModifyWorkOrderQuery();
    }

    /**
     * Create an instance of {@link AdditionalRequirements }
     * 
     */
    public AdditionalRequirements createAdditionalRequirements() {
        return new AdditionalRequirements();
    }

    /**
     * Create an instance of {@link Inventory }
     * 
     */
    public Inventory createInventory() {
        return new Inventory();
    }

    /**
     * Create an instance of {@link Device }
     * 
     */
    public Device createDevice() {
        return new Device();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link TaskList }
     * 
     */
    public TaskList createTaskList() {
        return new TaskList();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link WorkOrderQuery.Key }
     * 
     */
    public WorkOrderQuery.Key createWorkOrderQueryKey() {
        return new WorkOrderQuery.Key();
    }

    /**
     * Create an instance of {@link AvailableSlots.Slots }
     * 
     */
    public AvailableSlots.Slots createAvailableSlotsSlots() {
        return new AvailableSlots.Slots();
    }

    /**
     * Create an instance of {@link WorkOrder.Tasks }
     * 
     */
    public WorkOrder.Tasks createWorkOrderTasks() {
        return new WorkOrder.Tasks();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalRequirements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "additionalRequirements", scope = CreateWorkOrderQuery.class)
    public JAXBElement<AdditionalRequirements> createCreateWorkOrderQueryAdditionalRequirements(AdditionalRequirements value) {
        return new JAXBElement<AdditionalRequirements>(_CreateWorkOrderQueryAdditionalRequirements_QNAME, AdditionalRequirements.class, CreateWorkOrderQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "workOrderId", scope = CreateWorkOrderQuery.class)
    public JAXBElement<String> createCreateWorkOrderQueryWorkOrderId(String value) {
        return new JAXBElement<String>(_CreateWorkOrderQueryWorkOrderId_QNAME, String.class, CreateWorkOrderQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inventory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inventory", scope = CreateWorkOrderQuery.class)
    public JAXBElement<Inventory> createCreateWorkOrderQueryInventory(Inventory value) {
        return new JAXBElement<Inventory>(_CreateWorkOrderQueryInventory_QNAME, Inventory.class, CreateWorkOrderQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customer", scope = CreateWorkOrderQuery.class)
    public JAXBElement<Customer> createCreateWorkOrderQueryCustomer(Customer value) {
        return new JAXBElement<Customer>(_CreateWorkOrderQueryCustomer_QNAME, Customer.class, CreateWorkOrderQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchAvailableAppointmentSlotsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "fetchAvailableAppointmentSlotsResponse")
    public JAXBElement<FetchAvailableAppointmentSlotsResponse> createFetchAvailableAppointmentSlotsResponse(FetchAvailableAppointmentSlotsResponse value) {
        return new JAXBElement<FetchAvailableAppointmentSlotsResponse>(_FetchAvailableAppointmentSlotsResponse_QNAME, FetchAvailableAppointmentSlotsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateWorkOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "createWorkOrder")
    public JAXBElement<CreateWorkOrder> createCreateWorkOrder(CreateWorkOrder value) {
        return new JAXBElement<CreateWorkOrder>(_CreateWorkOrder_QNAME, CreateWorkOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RescheduleTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "rescheduleTask")
    public JAXBElement<RescheduleTask> createRescheduleTask(RescheduleTask value) {
        return new JAXBElement<RescheduleTask>(_RescheduleTask_QNAME, RescheduleTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateWorkOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "createWorkOrderResponse")
    public JAXBElement<CreateWorkOrderResponse> createCreateWorkOrderResponse(CreateWorkOrderResponse value) {
        return new JAXBElement<CreateWorkOrderResponse>(_CreateWorkOrderResponse_QNAME, CreateWorkOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyWorkOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "modifyWorkOrder")
    public JAXBElement<ModifyWorkOrder> createModifyWorkOrder(ModifyWorkOrder value) {
        return new JAXBElement<ModifyWorkOrder>(_ModifyWorkOrder_QNAME, ModifyWorkOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RescheduleTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "rescheduleTaskResponse")
    public JAXBElement<RescheduleTaskResponse> createRescheduleTaskResponse(RescheduleTaskResponse value) {
        return new JAXBElement<RescheduleTaskResponse>(_RescheduleTaskResponse_QNAME, RescheduleTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelWorkOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "cancelWorkOrder")
    public JAXBElement<CancelWorkOrder> createCancelWorkOrder(CancelWorkOrder value) {
        return new JAXBElement<CancelWorkOrder>(_CancelWorkOrder_QNAME, CancelWorkOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "ApplicationException")
    public JAXBElement<ApplicationException> createApplicationException(ApplicationException value) {
        return new JAXBElement<ApplicationException>(_ApplicationException_QNAME, ApplicationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchAvailableAppointmentSlots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "fetchAvailableAppointmentSlots")
    public JAXBElement<FetchAvailableAppointmentSlots> createFetchAvailableAppointmentSlots(FetchAvailableAppointmentSlots value) {
        return new JAXBElement<FetchAvailableAppointmentSlots>(_FetchAvailableAppointmentSlots_QNAME, FetchAvailableAppointmentSlots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "createTask")
    public JAXBElement<CreateTask> createCreateTask(CreateTask value) {
        return new JAXBElement<CreateTask>(_CreateTask_QNAME, CreateTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "cancelTaskResponse")
    public JAXBElement<CancelTaskResponse> createCancelTaskResponse(CancelTaskResponse value) {
        return new JAXBElement<CancelTaskResponse>(_CancelTaskResponse_QNAME, CancelTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseWorkOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "closeWorkOrderResponse")
    public JAXBElement<CloseWorkOrderResponse> createCloseWorkOrderResponse(CloseWorkOrderResponse value) {
        return new JAXBElement<CloseWorkOrderResponse>(_CloseWorkOrderResponse_QNAME, CloseWorkOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchWorkOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "fetchWorkOrderResponse")
    public JAXBElement<FetchWorkOrderResponse> createFetchWorkOrderResponse(FetchWorkOrderResponse value) {
        return new JAXBElement<FetchWorkOrderResponse>(_FetchWorkOrderResponse_QNAME, FetchWorkOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchWorkOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "fetchWorkOrder")
    public JAXBElement<FetchWorkOrder> createFetchWorkOrder(FetchWorkOrder value) {
        return new JAXBElement<FetchWorkOrder>(_FetchWorkOrder_QNAME, FetchWorkOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelWorkOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "cancelWorkOrderResponse")
    public JAXBElement<CancelWorkOrderResponse> createCancelWorkOrderResponse(CancelWorkOrderResponse value) {
        return new JAXBElement<CancelWorkOrderResponse>(_CancelWorkOrderResponse_QNAME, CancelWorkOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "cancelTask")
    public JAXBElement<CancelTask> createCancelTask(CancelTask value) {
        return new JAXBElement<CancelTask>(_CancelTask_QNAME, CancelTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseWorkOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "closeWorkOrder")
    public JAXBElement<CloseWorkOrder> createCloseWorkOrder(CloseWorkOrder value) {
        return new JAXBElement<CloseWorkOrder>(_CloseWorkOrder_QNAME, CloseWorkOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyWorkOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "modifyWorkOrderResponse")
    public JAXBElement<ModifyWorkOrderResponse> createModifyWorkOrderResponse(ModifyWorkOrderResponse value) {
        return new JAXBElement<ModifyWorkOrderResponse>(_ModifyWorkOrderResponse_QNAME, ModifyWorkOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/", name = "createTaskResponse")
    public JAXBElement<CreateTaskResponse> createCreateTaskResponse(CreateTaskResponse value) {
        return new JAXBElement<CreateTaskResponse>(_CreateTaskResponse_QNAME, CreateTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = AdministrationUnit.class)
    public JAXBElement<String> createAdministrationUnitId(String value) {
        return new JAXBElement<String>(_AdministrationUnitId_QNAME, String.class, AdministrationUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdministrationUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "administrationUnit", scope = AdministrationUnit.class)
    public JAXBElement<AdministrationUnit> createAdministrationUnitAdministrationUnit(AdministrationUnit value) {
        return new JAXBElement<AdministrationUnit>(_AdministrationUnitAdministrationUnit_QNAME, AdministrationUnit.class, AdministrationUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalRequirements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "additionalRequirements", scope = AvailableSlotsQuery.class)
    public JAXBElement<AdditionalRequirements> createAvailableSlotsQueryAdditionalRequirements(AdditionalRequirements value) {
        return new JAXBElement<AdditionalRequirements>(_CreateWorkOrderQueryAdditionalRequirements_QNAME, AdditionalRequirements.class, AvailableSlotsQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inventory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inventory", scope = AvailableSlotsQuery.class)
    public JAXBElement<Inventory> createAvailableSlotsQueryInventory(Inventory value) {
        return new JAXBElement<Inventory>(_CreateWorkOrderQueryInventory_QNAME, Inventory.class, AvailableSlotsQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customer", scope = AvailableSlotsQuery.class)
    public JAXBElement<Customer> createAvailableSlotsQueryCustomer(Customer value) {
        return new JAXBElement<Customer>(_CreateWorkOrderQueryCustomer_QNAME, Customer.class, AvailableSlotsQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalRequirements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "additionalRequirements", scope = CreateTaskQuery.class)
    public JAXBElement<AdditionalRequirements> createCreateTaskQueryAdditionalRequirements(AdditionalRequirements value) {
        return new JAXBElement<AdditionalRequirements>(_CreateWorkOrderQueryAdditionalRequirements_QNAME, AdditionalRequirements.class, CreateTaskQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inventory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inventory", scope = CreateTaskQuery.class)
    public JAXBElement<Inventory> createCreateTaskQueryInventory(Inventory value) {
        return new JAXBElement<Inventory>(_CreateWorkOrderQueryInventory_QNAME, Inventory.class, CreateTaskQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customer", scope = CreateTaskQuery.class)
    public JAXBElement<Customer> createCreateTaskQueryCustomer(Customer value) {
        return new JAXBElement<Customer>(_CreateWorkOrderQueryCustomer_QNAME, Customer.class, CreateTaskQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "businessName", scope = Customer.class)
    public JAXBElement<String> createCustomerBusinessName(String value) {
        return new JAXBElement<String>(_CustomerBusinessName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lastName", scope = Customer.class)
    public JAXBElement<String> createCustomerLastName(String value) {
        return new JAXBElement<String>(_CustomerLastName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "location", scope = Customer.class)
    public JAXBElement<Location> createCustomerLocation(Location value) {
        return new JAXBElement<Location>(_CustomerLocation_QNAME, Location.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email", scope = Customer.class)
    public JAXBElement<String> createCustomerEmail(String value) {
        return new JAXBElement<String>(_CustomerEmail_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phoneNumber2", scope = Customer.class)
    public JAXBElement<String> createCustomerPhoneNumber2(String value) {
        return new JAXBElement<String>(_CustomerPhoneNumber2_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phoneNumber1", scope = Customer.class)
    public JAXBElement<String> createCustomerPhoneNumber1(String value) {
        return new JAXBElement<String>(_CustomerPhoneNumber1_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "firstName", scope = Customer.class)
    public JAXBElement<String> createCustomerFirstName(String value) {
        return new JAXBElement<String>(_CustomerFirstName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contacts", scope = Customer.class)
    public JAXBElement<Contacts> createCustomerContacts(Contacts value) {
        return new JAXBElement<Contacts>(_CustomerContacts_QNAME, Contacts.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phoneNumber3", scope = Customer.class)
    public JAXBElement<String> createCustomerPhoneNumber3(String value) {
        return new JAXBElement<String>(_CustomerPhoneNumber3_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "buildingNo", scope = Location.class)
    public JAXBElement<String> createLocationBuildingNo(String value) {
        return new JAXBElement<String>(_LocationBuildingNo_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "streetId", scope = Location.class)
    public JAXBElement<String> createLocationStreetId(String value) {
        return new JAXBElement<String>(_LocationStreetId_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cityId", scope = Location.class)
    public JAXBElement<String> createLocationCityId(String value) {
        return new JAXBElement<String>(_LocationCityId_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = Location.class)
    public JAXBElement<String> createLocationDescription(String value) {
        return new JAXBElement<String>(_LocationDescription_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "longitude", scope = Location.class)
    public JAXBElement<BigDecimal> createLocationLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LocationLongitude_QNAME, BigDecimal.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "streetName", scope = Location.class)
    public JAXBElement<String> createLocationStreetName(String value) {
        return new JAXBElement<String>(_LocationStreetName_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "latitude", scope = Location.class)
    public JAXBElement<BigDecimal> createLocationLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LocationLatitude_QNAME, BigDecimal.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flatNo", scope = Location.class)
    public JAXBElement<String> createLocationFlatNo(String value) {
        return new JAXBElement<String>(_LocationFlatNo_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdministrationUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cityAdministrationUnit", scope = Location.class)
    public JAXBElement<AdministrationUnit> createLocationCityAdministrationUnit(AdministrationUnit value) {
        return new JAXBElement<AdministrationUnit>(_LocationCityAdministrationUnit_QNAME, AdministrationUnit.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customer", scope = ModifyWorkOrderQuery.class)
    public JAXBElement<Customer> createModifyWorkOrderQueryCustomer(Customer value) {
        return new JAXBElement<Customer>(_CreateWorkOrderQueryCustomer_QNAME, Customer.class, ModifyWorkOrderQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Services }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "services", scope = Inventory.class)
    public JAXBElement<Services> createInventoryServices(Services value) {
        return new JAXBElement<Services>(_InventoryServices_QNAME, Services.class, Inventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Node }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "node", scope = Inventory.class)
    public JAXBElement<Node> createInventoryNode(Node value) {
        return new JAXBElement<Node>(_InventoryNode_QNAME, Node.class, Inventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Devices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "devices", scope = Inventory.class)
    public JAXBElement<Devices> createInventoryDevices(Devices value) {
        return new JAXBElement<Devices>(_InventoryDevices_QNAME, Devices.class, Inventory.class, value);
    }

}

public class ServiceStation {

    public void checkOneType(ServiceAll serviceAll) {
        serviceAll.service();
    }

    public void checkAllObjects(ServiceAll[] serviceAllObjects) {
        for (ServiceAll serviceAllObject : serviceAllObjects) {
            serviceAllObject.service();
        }
    }
}

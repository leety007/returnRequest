
package rentalService.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="MyOrder", url="${api.myOrder.url}")
//@FeignClient(name="MyOrder", url="http://localhost:8084")
public interface MyOrderService {

    @RequestMapping(method= RequestMethod.POST, path="/myOrders")
    public void saveInformation(@RequestBody MyOrder myOrder);

}
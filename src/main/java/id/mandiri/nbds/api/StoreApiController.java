package id.mandiri.nbds.api;

import java.util.Map;
import id.mandiri.nbds.model.Order;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import id.mandiri.nbds.services.GetInventoryI;
import id.mandiri.nbds.model.GetInventoryP;
import id.mandiri.nbds.model.GetInventoryResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import id.mandiri.nbds.services.PlaceOrderI;
import id.mandiri.nbds.model.PlaceOrderP;
import id.mandiri.nbds.model.PlaceOrderResponseWrapper;
import id.mandiri.nbds.services.GetOrderByIdI;
import id.mandiri.nbds.model.GetOrderByIdP;
import id.mandiri.nbds.model.GetOrderByIdResponseWrapper;
import id.mandiri.nbds.services.DeleteOrderI;
import id.mandiri.nbds.model.DeleteOrderP;
import id.mandiri.nbds.model.DeleteOrderResponseWrapper;

@RestController
public class StoreApiController implements StoreApi {

	@Autowired
	DeleteOrderI deleteOrderI;


	@Autowired
	GetOrderByIdI getOrderByIdI;


	@Autowired
	PlaceOrderI placeOrderI;


	@Autowired
	GetInventoryI getInventoryI;


    public ResponseEntity<Void> deleteOrder(@Min(1L)@ApiParam(value = "ID of the order that needs to be deleted",required=true) @PathVariable("orderId") Long orderId){
        
        DeleteOrderResponseWrapper res  = deleteOrderI.execute(new DeleteOrderP(orderId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Map<String, Integer>> getInventory(){
        
        GetInventoryResponseWrapper res  = getInventoryI.execute(new GetInventoryP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Order> getOrderById(@Min(1L) @Max(10L) @ApiParam(value = "ID of pet that needs to be fetched",required=true) @PathVariable("orderId") Long orderId){
        
        GetOrderByIdResponseWrapper res  = getOrderByIdI.execute(new GetOrderByIdP(orderId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true )  @Valid @RequestBody Order body){
        
        PlaceOrderResponseWrapper res  = placeOrderI.execute(new PlaceOrderP(body));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}

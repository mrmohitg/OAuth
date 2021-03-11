package sumws.ws;

import javax.jws.WebResult;
import javax.jws.WebService;

import sumws.dto.SumRequest;
import sumws.dto.SumResponse;

@WebService(name="SumWs")
public interface SumWS {

	@WebResult(name = "response")
	SumResponse calculateSum (SumRequest request);
}

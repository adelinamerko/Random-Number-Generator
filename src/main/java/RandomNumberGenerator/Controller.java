package RandomNumberGenerator;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

	@RequestMapping("/")
	public String index() {
		String style = "\"color:white;font-size:10rem;position: absolute; top: 30%;left: 50%;-moz-transform: translateX(-50%) translateY(-50%);-webkit-transform: translateX(-50%) translateY(-50%);transform: translateX(-50%) translateY(-50%);\"";
		return "<html><body style=\"background:black\"><h1 style=" + style + ">" + new Random().nextInt(5000)
				+ "</h1></body></html>";
	}
}

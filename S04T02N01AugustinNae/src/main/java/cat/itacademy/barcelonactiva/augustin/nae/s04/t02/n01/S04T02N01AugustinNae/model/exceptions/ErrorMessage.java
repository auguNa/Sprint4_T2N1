package cat.itacademy.barcelonactiva.augustin.nae.s04.t02.n01.S04T02N01AugustinNae.model.exceptions;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorMessage {
	private int statusCode;
	private Date timestamp;
	private String message;
	private String description;
}

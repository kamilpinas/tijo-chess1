package pl.edu.pwsztar.chess.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.edu.pwsztar.chess.domain.FigureType;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@ToString
public class FigureMoveDto implements Serializable {
    private String source;
    private String destination;
    private FigureType type;
}

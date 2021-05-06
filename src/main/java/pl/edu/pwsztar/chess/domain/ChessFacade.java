package pl.edu.pwsztar.chess.domain;

import pl.edu.pwsztar.chess.dto.FigureMoveDto;

import javax.transaction.Transactional;
import java.awt.*;

@Transactional
public class ChessFacade {


    public boolean bishopMove(FigureMoveDto figureMoveDto) {
        Point source = Converter.convertSource(figureMoveDto);
        Point destination = Converter.convertDestination(figureMoveDto);
        return Correctness.isCorrect(source, destination);
    }


}

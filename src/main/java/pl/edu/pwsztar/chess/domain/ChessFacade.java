package pl.edu.pwsztar.chess.domain;

import pl.edu.pwsztar.chess.dto.FigureMoveDto;

import javax.transaction.Transactional;
import java.awt.*;

@Transactional
public class ChessFacade {


    public boolean bishopMove(FigureMoveDto figureMoveDto) {
        Point source = new Point(figureMoveDto.getSource().charAt(0), figureMoveDto.getSource().charAt(2));
        Point destination = new Point(figureMoveDto.getDestination().charAt(0), figureMoveDto.getDestination().charAt(2));
        return Correctness.isCorrect(source,destination);
    }


}

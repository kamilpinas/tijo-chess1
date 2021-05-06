package pl.edu.pwsztar.chess.domain;

import pl.edu.pwsztar.chess.dto.FigureMoveDto;

import java.awt.*;

abstract class Converter {

    public Converter() {

    }

    static Point convertSource(FigureMoveDto figureMoveDto) {
        return new Point(figureMoveDto.getSource().charAt(0), figureMoveDto.getSource().charAt(2));
    }

    static Point convertDestination(FigureMoveDto figureMoveDto) {
        return new Point(figureMoveDto.getDestination().charAt(0), figureMoveDto.getDestination().charAt(2));
    }
}

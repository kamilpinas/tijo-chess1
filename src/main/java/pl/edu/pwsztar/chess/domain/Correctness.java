package pl.edu.pwsztar.chess.domain;

import java.awt.*;

abstract class Correctness {

    static boolean isCorrect(Point source, Point destination){
        if(((source.x-source.y) ==(destination.x-destination.y) || (source.x+source.y) == (destination.x+destination.y))){
            return true;
        }
        else {
            return false;
        }
    }
}

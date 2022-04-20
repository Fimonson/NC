package com.netcracker.HW3.ch9.project1;

public class King extends ChessPiece {
    public King(String position) {
        super.setPosition(position);
        char x = position.charAt(0);
        char y = position.charAt(1);
        String possiblePosition;
        if (x < 'h' && x > 'a' && y < '8' && y > '1') {
            super.setMoveTo(position.replace(x, ++x));
            --x;

            super.setMoveTo(position.replace(x, --x));
            ++x;

            super.setMoveTo(position.replace(y, ++y));
            --y;

            super.setMoveTo(position.replace(y, --y));
            ++y;

            possiblePosition = position.replace(x, ++x);
            --x;
            possiblePosition = possiblePosition.replace(y, ++y);
            --y;
            super.setMoveTo(possiblePosition);

            possiblePosition = position.replace(x, ++x);
            --x;
            possiblePosition = possiblePosition.replace(y, --y);
            ++y;
            super.setMoveTo(possiblePosition);

            possiblePosition = position.replace(x, --x);
            ++x;
            possiblePosition = possiblePosition.replace(y, ++y);
            --y;
            super.setMoveTo(possiblePosition);

            possiblePosition = position.replace(x, --x);
            ++x;
            possiblePosition = possiblePosition.replace(y, --y);
            ++y;
            super.setMoveTo(possiblePosition);
        }
        if (x < 'h' && x == 'a' && y < '8' && y > '1') {

            super.setMoveTo(position.replace(x, --x));
            ++x;

            super.setMoveTo(position.replace(y, ++y));
            --y;

            super.setMoveTo(position.replace(y, --y));
            ++y;

            possiblePosition = position.replace(x, ++x);
            --x;
            possiblePosition = possiblePosition.replace(y, ++y);
            --y;
            super.setMoveTo(possiblePosition);

            possiblePosition = position.replace(x, ++x);
            --x;
            possiblePosition = possiblePosition.replace(y, --y);
            ++y;
            super.setMoveTo(possiblePosition);

        }
        if (x == 'h' && x > 'a' && y < '8' && y > '1') {
            super.setMoveTo(position.replace(x, ++x));
            --x;

            super.setMoveTo(position.replace(y, ++y));
            --y;

            super.setMoveTo(position.replace(y, --y));
            ++y;

            possiblePosition = position.replace(x, --x);
            ++x;
            possiblePosition = possiblePosition.replace(y, ++y);
            --y;
            super.setMoveTo(possiblePosition);

            possiblePosition = position.replace(x, --x);
            ++x;
            possiblePosition = possiblePosition.replace(y, --y);
            ++y;
            super.setMoveTo(possiblePosition);
        }
        if (x < 'h' && x > 'a' && y == '8' && y > '1') {
            super.setMoveTo(position.replace(x, ++x));
            --x;

            super.setMoveTo(position.replace(x, --x));
            ++x;

            super.setMoveTo(position.replace(y, --y));
            ++y;

            possiblePosition = position.replace(x, ++x);
            --x;
            possiblePosition = possiblePosition.replace(y, --y);
            ++y;
            super.setMoveTo(possiblePosition);

            possiblePosition = position.replace(x, --x);
            ++x;
            possiblePosition = possiblePosition.replace(y, --y);
            ++y;
            super.setMoveTo(possiblePosition);
        }
        if (x < 'h' && x > 'a' && y < '8' && y == '1') {
            super.setMoveTo(position.replace(x, ++x));
            --x;

            super.setMoveTo(position.replace(x, --x));
            ++x;

            super.setMoveTo(position.replace(y, ++y));
            --y;

            possiblePosition = position.replace(x, ++x);
            --x;
            possiblePosition = possiblePosition.replace(y, ++y);
            --y;
            super.setMoveTo(possiblePosition);


            possiblePosition = position.replace(x, --x);
            ++x;
            possiblePosition = possiblePosition.replace(y, ++y);
            --y;
            super.setMoveTo(possiblePosition);

        }
        if (x == 'h' && x > 'a' && y == '8' && y > '1') {

            super.setMoveTo(position.replace(x, --x));
            ++x;

            super.setMoveTo(position.replace(y, --y));
            ++y;

            possiblePosition = position.replace(x, --x);
            ++x;
            possiblePosition = possiblePosition.replace(y, --y);
            ++y;
            super.setMoveTo(possiblePosition);
        }
        if (x == 'h' && x > 'a' && y < '8' && y == '1') {

            super.setMoveTo(position.replace(x, --x));
            ++x;

            super.setMoveTo(position.replace(y, ++y));
            --y;

            possiblePosition = position.replace(x, --x);
            ++x;
            possiblePosition = possiblePosition.replace(y, ++y);
            --y;
            super.setMoveTo(possiblePosition);
        }
        if (x < 'h' && x == 'a' && y < '8' && y == '1') {
            super.setMoveTo(position.replace(x, ++x));
            --x;

            super.setMoveTo(position.replace(y, ++y));
            --y;

            possiblePosition = position.replace(x, ++x);
            --x;
            possiblePosition = possiblePosition.replace(y, ++y);
            --y;
            super.setMoveTo(possiblePosition);
        }
        if (x < 'h' && x == 'a' && y == '8' && y > '1') {
            super.setMoveTo(position.replace(x, ++x));
            --x;

            super.setMoveTo(position.replace(y, --y));
            ++y;

            possiblePosition = position.replace(x, ++x);
            --x;
            possiblePosition = possiblePosition.replace(y, --y);
            ++y;
            super.setMoveTo(possiblePosition);
        }
    }
}

package net.ssingh.lox;

import java.util.List;

interface LoxCallable {
    int airty();
    Object call(Interpreter interpreter, List<Object> arguments);
}

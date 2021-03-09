from antlr4 import CommonTokenStream, StdinStream, ParseTreeWalker
from LittleDuckLexer import LittleDuckLexer
from LittleDuckListener import LittleDuckListener
from LittleDuckParser import LittleDuckParser
import sys

class LittleDuckPrintListener(LittleDuckListener):
    def enterHi(self, ctx):
        print("Hello: %s" % ctx.ID())

def main():
    lexer = LittleDuckLexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = LittleDuckParser(stream)
    tree = parser.program()
    printer = LittleDuckListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main()
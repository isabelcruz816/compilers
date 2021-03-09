from antlr4 import *
from LittleDuckLexer import LittleDuckLexer
from LittleDuckListener import LittleDuckListener
from LittleDuckParser import LittleDuckParser
import sys

def main(): # tree walking
  def handleExpression(expr):
    print("Parsed expression %s has value %s" % (expr.getText(), expr))

  lexer = LittleDuckLexer(StdinStream())
  stream = CommonTokenStream(lexer)
  parser = LittleDuckParser(stream)
  tree = parser.program()
  printer = LittleDuckListener()
  walker = ParseTreeWalker()
  walker.walk(printer, tree)
  handleExpression(tree)

if __name__ == '__main__':
    main()
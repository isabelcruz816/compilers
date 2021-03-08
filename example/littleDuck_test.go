package test

import (
	"fmt"
	"os"
	"testing"

	"example/lexer"
	"example/parser"
)

func readFile(path string) ([]byte, error) {
	file, err := os.Open(path)
	if err != nil {
		return nil, err
	}

	defer file.Close()

	fileinfo, err := file.Stat()
	if err != nil {
		return nil, err
	}

	filesize := fileinfo.Size()
	buffer := make([]byte, filesize)

	bytesr, err := file.Read(buffer)
	fmt.Println(bytesr)
	if err != nil {
		return nil, err
	}

	return buffer, nil
}

func TestDuck(t *testing.T) {
	p := parser.NewParser()
	tests := []string{
		"second.txt",
	}

	for _, test := range tests {
		input, err := readFile(test)

		if err != nil {
			t.Fatalf("Error reading file %s", test)
		}

		s := lexer.NewLexer(input)

		_, errtest := p.Parse(s)

		if errtest != nil {
			t.Errorf("Error: %v", errtest)
		}
	}
}

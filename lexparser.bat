@echo off
java -mx150m -cp "*;" edu.stanford.nlp.parser.lexparser.LexicalizedParser -outputFormat "penn,typedDependencies" edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz input.txt>output.txt

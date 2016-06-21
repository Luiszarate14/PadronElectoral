ifeq (run,$(firstword $(MAKECMDGOALS)))
  # use the rest as arguments for "run"
  RUN_ARGS := $(wordlist 2,$(words $(MAKECMDGOALS)),$(MAKECMDGOALS))
  # ...and turn them into do-nothing targets
  $(eval $(RUN_ARGS):;@:)
endif


all:
	mkdir -p build/
	javac -d build/ src/*/*.java 

clean:
	rm -rf build

run:
	java -classpath build/ padronelectoral.Main $(RUN_ARGS)


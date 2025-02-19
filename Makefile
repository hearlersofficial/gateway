.PHONY: build clean

PROTO_DIR=src/proto
GEN_DIR=src/gen
BUF=buf

build: clean
	git submodule foreach git pull origin main
	@echo "[LOG] Building Protocol Buffers..."
	cd $(PROTO_DIR) && $(BUF) generate --template=buf.gen.java.yaml --clean
	@echo "[LOG] Protocol Buffers build completed!"

clean:
	rm -rf $(GEN_DIR)/*
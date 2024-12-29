.PHONY: build clean

# 기본 디렉토리 설정
PROTO_DIR=src/proto
GEN_DIR=src/gen

# buf 명령어
BUF=buf

build:
	git submodule foreach git pull origin main
	@echo "[LOG] Building Protocol Buffers..."
	cd $(PROTO_DIR) && $(BUF) generate --template=buf.gen.java.yaml
	@echo "[LOG] Protocol Buffers build completed!"
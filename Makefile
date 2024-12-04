.PHONY: build clean

# 기본 디렉토리 설정
PROTO_DIR=src/proto
GEN_DIR=src/gen

# buf 명령어
BUF=buf

build:
	@echo "Building Protocol Buffers..."
	cd $(PROTO_DIR) && $(BUF) generate --template=buf.gen.java.yaml
	@echo "Protocol Buffers build completed!"

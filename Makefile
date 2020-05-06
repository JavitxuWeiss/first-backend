.PHONY: build delete run

devel-env:
	docker-compose -f docker/environment.yml -f docker/environment-ports.yml up -d

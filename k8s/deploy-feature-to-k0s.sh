kubectx k0s
kubens k8scc-pr

git pull
helm upgrade --install pr-test onechart/onechart --version 0.70.0 -f helm-values/k0s-values-pr.yaml

curl -k  https://prwebclient:30253/actuator/health

sudo apt-get install mailutils
EMAIL=$Email_Destino
echo "Subject: Resultado do Pipeline CI/CD\n\nPipeline executado com sucesso" | sendmail "$EMAIL"
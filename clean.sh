# find . -type f -name "*.class" -exec rm {} +
find . -type f -name "*.class" -not -path "*/util/*" -exec rm {} +

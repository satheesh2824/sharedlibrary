def add(x,y){
  sh """
  sum=$((${x} + ${y}))"
  echo "sum of ${x} and ${y} is ${sum}"
  """
}

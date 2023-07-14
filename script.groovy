def buildApp()
{
      echo 'building the applications...'
      echo "The build has been initiated by: ${AUTHOR}"
      echo "This is a ${stringPara} pipeline.."
}

def testApp()
{
    echo "testing the application with version: ${params.VERSION}"
}
return this

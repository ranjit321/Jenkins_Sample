pipeline{
  agent any
  environment {
    AUTHOR='Ranjit Kumar Mahto'
    CRED=credentials('testCred')
  }
  parameters{
    string (name:'stringPara',defaultValue:'',description:'version parameter')
    choice(name:'VERSION',choices:['1.1.0','1.5.0'],description:'')
    booleanParam(name:'executeTests',defaultValue:true,description:'')
  }
  
  stages {
    stage("build"){
      steps{
        echo 'building the applications...'
        echo "The build has been initiated by: ${AUTHOR}"
      }
    }
    stage ("test")
    {
      when{
        expression{
            params.executeTests && params.VERSION=='1.1.0'
        }
      }
      steps{
        echo "testing the application with version: ${params.VERSION}"
      }
    }
    stage ("deploy")
    {
      steps{
        echo 'deploying the application..'
        echo "deploying with credential..${CRED}"
      }
    }
  }
  post{
    always{
        echo 'The build process has been completed'
    }
    success{
        echo 'The build was sucessful...'
    }
    failure
    {
        echo 'The build failed... Please check for errors'
    }
  }
}

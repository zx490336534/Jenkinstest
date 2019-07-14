//@Library('extended-library')
pipeline{
   agent any
   parameters {
      
  extendedChoice bindings: '', description: '', groovyClasspath: '', groovyScript: '''import org.boon.Boon;
def jsonEditorOptions = Boon.fromJson(/{
        disable_edit_json: true,
        disable_properties: true,
        no_additional_properties: true,
        disable_collapse: true,
        disable_array_add: true,
        disable_array_delete: true,
        disable_array_reorder: true,
        theme: "bootstrap2",
        iconlib:"fontawesome4",
        schema: {
          "title": "Color Picker",
          "type": "object",
          "properties": {
            "color": {
              "type": "string",
              "format": "color"
            }
          }
        },
        startval: {
            color :"red"
        }
}/);''', multiSelectDelimiter: ',', name: 'Policy', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_JSON', visibleItemCount: 5


   }
   stages{
      stage('Example'){
         steps{
            withPythonEnv('/usr/bin/python'){
               sh 'python -m pip install pytest '
               sh 'python -m pip install allure-pytest'
               sh 'python -m pytest -v test_allure.py --alluredir=allure-results'
            }
            exit 0
         }
      }
   }
   post{
      always{
         allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
      }
   }
}
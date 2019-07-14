import org.boon.Boon;
 
def call = Boon.fromJson(/{
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
}/);
/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 */
'use strict';

var React = require('react-native');
var Login = require('LoginModule');
var ToastAndroid = require('ToastModule')

var {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  TextInput,
  TouchableNativeFeedback,
} = React;

var username = '';
var password = '';

var LoginProto = React.createClass({

  buttonClicked: function() {
    Login.getCredentials(username, password);
  },
  onUsernameChange: function (text) {
    username = text;
  },
  onPasswordChange: function (text) {
    password = text;
  },
  render: function() {
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          Usernameeee:
        </Text>
        <TextInput style={styles.textBox}
          onChangeText={this.onUsernameChange}/>

        <Text style={styles.welcome}>
          Password:
        </Text>
         <TextInput style={styles.textBox}
          onChangeText={this.onPasswordChange}
          secureTextEntry={true}/>

        <TouchableNativeFeedback
          onPress={this.buttonClicked.bind(this)}
          background={TouchableNativeFeedback.SelectableBackground()}>
            <View style={styles.button}>
              <Text style={styles.instructions}>Login</Text>
            </View>
        </TouchableNativeFeedback>
      </View>
    );
  }
});

var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
  textBox: {
    height: 40,
    borderColor: 'gray',
    borderWidth: 2,
    marginRight: 100,
    marginLeft: 100,
  },
  button: {
    width: 150,
    height: 50,
    backgroundColor: '#00cccc',
    margin: 50,
  },
});

AppRegistry.registerComponent('LoginProto', () => LoginProto);

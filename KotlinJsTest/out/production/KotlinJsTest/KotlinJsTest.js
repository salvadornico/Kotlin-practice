if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'KotlinJsTest'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'KotlinJsTest'.");
}
if (typeof this['kotlinx-html-js'] === 'undefined') {
  throw new Error("Error loading module 'KotlinJsTest'. Its dependency 'kotlinx-html-js' was not found. Please, check whether 'kotlinx-html-js' is loaded prior to 'KotlinJsTest'.");
}
var KotlinJsTest = function (_, Kotlin, $module$kotlinx_html_js) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  var get_create = $module$kotlinx_html_js.kotlinx.html.dom.get_create_4wc2mh$;
  var h1 = $module$kotlinx_html_js.kotlinx.html.h1_vmej1w$;
  var set_onClickFunction = $module$kotlinx_html_js.kotlinx.html.js.set_onClickFunction_pszlq2$;
  var button = $module$kotlinx_html_js.kotlinx.html.button_whohl6$;
  var div = $module$kotlinx_html_js.kotlinx.html.div_59el9d$;
  function main$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('Hello Kotlinx HTML');
  }
  function main$lambda$lambda$lambda(it) {
    println('Clicked again');
  }
  function main$lambda$lambda_0($receiver) {
    $receiver.unaryPlus_pdl1vz$('Click Me');
    set_onClickFunction($receiver, main$lambda$lambda$lambda);
  }
  function main$lambda($receiver) {
    h1($receiver, void 0, main$lambda$lambda);
    button($receiver, void 0, void 0, void 0, void 0, main$lambda$lambda_0);
  }
  function main(args) {
    var root = document.getElementById('root');
    var xyz = window.xyz;
    println('Variable xyz: ' + xyz);
    var user = window.user;
    println(user.firstName);
    var myFunc = window.myFunction;
    myFunc();
    var monkey = monkey;
    println('Variable monkey: ' + monkey);
    var div_0 = div(get_create(document), void 0, main$lambda);
    (root != null ? root : Kotlin.throwNPE()).appendChild(div_0);
  }
  _.main_kand9s$ = main;
  Kotlin.defineModule('KotlinJsTest', _);
  main([]);
  return _;
}(typeof KotlinJsTest === 'undefined' ? {} : KotlinJsTest, kotlin, this['kotlinx-html-js']);

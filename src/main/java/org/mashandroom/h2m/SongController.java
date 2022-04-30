package org.mashandroom.h2m;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("everything")
public class SongController {

  @GetMapping("itsyou/get")
  public String get() {
    return "世間知らずだった 少年時代から 自分だけを信じてきたけど";
  }

}

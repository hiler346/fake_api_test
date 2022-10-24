package Utils;

import Models.*;
import Utils.HelpModels.HelpModels;

import java.util.Date;

public class Generator {
  public static Login ParamsLogin(
    String username,
    String password
  )
  {
    Login login = new Login();
    login.setUsername(username);
    login.setPassword(password);

    return login;
  }

  public static Page ParamsPage(
          int page,
          int per_page,
          int total,
          int total_pages,
          int id,
          String email,
          String first_name,
          String last_name,
          String avatar,
          int id1,
          String email1,
          String first_name1,
          String last_name1,
          String avatar1,
          int id2,
          String email2,
          String first_name2,
          String last_name2,
          String avatar2,
          int id3,
          String email3,
          String first_name3,
          String last_name3,
          String avatar3,
          int id4,
          String email4,
          String first_name4,
          String last_name4,
          String avatar4,
          String url,
          String text
  ) {


    Page pages = new Page();

    pages.setPage(page);
    pages.setPer_page(per_page);
    pages.setTotal(total);
    pages.setTotal_pages(total_pages);

    DataModels datamodules = new DataModels();

    datamodules.setId(id);
    datamodules.setEmail(email);
    datamodules.setFirst_name(first_name);
    datamodules.setLast_name(last_name);
    datamodules.setAvatar(avatar);

    DataModels datamodules1 = new DataModels();

    datamodules1.setId(id1);
    datamodules1.setEmail(email1);
    datamodules1.setFirst_name(first_name1);
    datamodules1.setLast_name(last_name1);
    datamodules1.setAvatar(avatar1);

    DataModels datamodules2 = new DataModels();

    datamodules2.setId(id2);
    datamodules2.setEmail(email2);
    datamodules2.setFirst_name(first_name2);
    datamodules2.setLast_name(last_name2);
    datamodules2.setAvatar(avatar2);


    DataModels datamodules3 = new DataModels();

    datamodules3.setId(id3);
    datamodules3.setEmail(email3);
    datamodules3.setFirst_name(first_name3);
    datamodules3.setLast_name(last_name3);
    datamodules3.setAvatar(avatar3);

    DataModels datamodules4 = new DataModels();

    datamodules4.setId(id4);
    datamodules4.setEmail(email4);
    datamodules4.setFirst_name(first_name4);
    datamodules4.setLast_name(last_name4);
    datamodules4.setAvatar(avatar4);

    DataModels[] arrayData = {datamodules,datamodules1,datamodules2,datamodules3,datamodules4};


    supportModels suppormodels = new supportModels();

    suppormodels.setUrl(url);
    suppormodels.setText(text);

    datamodules.setSupport(suppormodels);

    pages.setData(arrayData);



    return  pages;
  }


}
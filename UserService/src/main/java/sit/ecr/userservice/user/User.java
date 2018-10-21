package sit.ecr.userservice.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "students")
public class User implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  private long userName;

  @NotBlank
  private String password;

  /**
   * @return the userName
   */
  public long getUserName() {
    return userName;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @param userName the userName to set
   */
  public void setUserName(long userName) {
    this.userName = userName;
  }


}
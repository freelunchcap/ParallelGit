package com.beijunyi.parallelgit.web.protocol;

import javax.annotation.Nonnull;

import com.beijunyi.parallelgit.web.data.RepositoryManager;
import com.beijunyi.parallelgit.web.workspace.User;
import com.beijunyi.parallelgit.web.workspace.Workspace;
import com.google.inject.Inject;

public class LoginHandler implements RequestHandler {

  private final RepositoryManager repoManager;

  @Inject
  public LoginHandler(@Nonnull RepositoryManager repoManager) {
    this.repoManager = repoManager;
  }

  @Override
  public String getType() {
    return "login";
  }

  @Nonnull
  @Override
  public ServerResponse handle(@Nonnull ClientRequest request, @Nonnull Workspace workspace) {
    User user = new User(request.getString("username"), request.getString("email"));
    workspace.setRepo(repoManager.getRepository());
    workspace.setUser(user);
    return request.respond().ok(user);
  }


}
package com.beijunyi.parallelgit.filesystem;

public enum GfsState {
  NORMAL,
  CHECKING_OUT,
  COMMITTING,
  MERGING,
  MERGING_CONFLICT,
  CHERRY_PICKING,
  CHERRY_PICKING_CONFLICT,
  RESETTING,
  CREATING_STASH,
  APPLYING_STASH
}
